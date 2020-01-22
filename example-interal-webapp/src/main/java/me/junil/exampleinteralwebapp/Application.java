package me.junil.exampleinteralwebapp;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Application {

  public static void main(String[] args) throws LifecycleException {
    // 기본적으로 spring에서는 tomcat을 제공한다.
    // tomcat을 이용하여 서버를 만들 수 있다.
    Tomcat tomcat = new Tomcat();
    tomcat.setPort(8000);
    Context context = tomcat.addContext("/", "/");

    HttpServlet servlet = new HttpServlet() {
      @Override
      protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println(
          "<html><head><title>hello Tomcat</title></head><body>hello tomcat</body></html>"
        );
      }
    };

    String servletName = "helloServlet";
    tomcat.addServlet("/", servletName, servlet);
    context.addServletMappingDecoded("/hello", servletName);
    tomcat.start();
    tomcat.getServer().await();
  }
}

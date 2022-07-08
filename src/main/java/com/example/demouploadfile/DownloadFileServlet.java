package com.example.demouploadfile;

import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "downloadFileServlet", value = "/download")
public class DownloadFileServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) {

        String imgName = request.getParameter("img");
//        response.setContentType("image/jpeg");
        response.setContentType("application/octet-stream");

        try (ServletOutputStream out = response.getOutputStream();
             FileInputStream fin = new FileInputStream(getServletContext().getRealPath("/images") + File.separator + imgName);
             BufferedInputStream bin = new BufferedInputStream(fin);
             BufferedOutputStream bout = new BufferedOutputStream(out);
        ) {
            int ch;
            while ((ch = bin.read()) != -1) {
                bout.write(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

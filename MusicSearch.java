package com.example;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MusicSearch")
public class MusicSearch extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String message = "Hello World";
        String[] musicList = null;

        // Define music arrays
        String[] kpop = {"TT from Twice", "ELEVEN from IVE", "OMG from Newjeans", "DNA from BTS", "Pretty U from SEVENTEEN"};
        String[] jpop = {"白日 from King&Gun", "マリゴールド from あいみょん", "アイドル from YOASOBI", "シンデレラボーイ from Saucy Dog", "きらり from 藤井風"};
        String[] wpop = {"Feather from Sabrina Carpenter", "Calm down from Taylor Swift", "Vampire from Olivia Rodrigo", "bad guy from Billie Eilish", "Happily from One Direction"};

        // Determine which genre was selected
        if ("kpop".equals(action)) {
            musicList = kpop;
        } else if ("jpop".equals(action)) {
            musicList = jpop;
        } else if ("wpop".equals(action)) {
            musicList = wpop;
        }

        // Select a random music title from the chosen genre
        if (musicList != null && musicList.length > 0) {
            Random rand = new Random();
            String randomMusic = musicList[rand.nextInt(musicList.length)];
            message =randomMusic;
        }

        request.setAttribute("message", message);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}

package java_24;

import java.awt.*;
import java.util.*;

public class FontMapper1 {
    HashMap<String, Font> fonts = new HashMap<>();
    
    public FontMapper1() {
        Font courier = new Font("Courier New", Font.PLAIN, 6);
        Font times = new Font("Times New Roman", Font.BOLD, 12);
        Font verdana = new Font("Verdana", Font.ITALIC, 25);
        fonts.put("smallprint", courier);
        fonts.put("body", times);
        fonts.put("headline", verdana);
    }
    
    
    public void addFont(String name, String style, String size) {
        int fontStyle = -1;
        if (style.equalsIgnoreCase("plain")) {
            fontStyle = Font.PLAIN;
        }
        if (style.equalsIgnoreCase("bold")) {
            fontStyle = Font.BOLD;
        }
        if (style.equalsIgnoreCase("italic")) {
            fontStyle = Font.ITALIC;
        }
        int fontSize = -1;
        try {
            fontSize = Integer.parseInt(size);
        } catch (NumberFormatException nfe) {
            
        }
        if ((fontStyle == -1) | (fontSize == -1)) {
            System.out.println("Invalid font style or size");
            return;
        }
        Font userFont = new Font(name, fontStyle, fontSize);
        fonts.put("user", userFont);
    }
    
    public void displayFonts() {
        for (Map.Entry<String, Font> entry : fonts.entrySet()) {
            String key = entry.getKey();
            Font value = entry.getValue();
            System.out.println(key + ": " + value.getSize() + "-pt "
                + value.getFontName());
        }
    }
     
    public static void main(String[] arguments) {
        FontMapper1 app = new FontMapper1();
        if (arguments.length < 3) {
            System.out.println("Usage: FontMapper2 name style size  ");
            System.exit(-1);
        }
        app.addFont(arguments[0], arguments[1], arguments[2]);
        app.displayFonts();
    }
}

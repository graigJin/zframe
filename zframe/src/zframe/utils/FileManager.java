package zframe.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.StringTokenizer;
import zframe.Handler;

public class FileManager {
    
    private Handler handler;

    public FileManager(Handler handler) {
        this.handler = handler;
    }
    
    private void writeMapToFile(String path, Map<Integer,?> map) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(path);
        } catch (FileNotFoundException ex) {
            handler.addLog("FileNotFoundException");
        }
        for (int i : map.keySet()) {
            writer.println("Line " + i);
        }
        writer.close();
    }
    
    private void readMapFromFile(String path, String delimiter, Map<Integer,String> map) {
        BufferedReader br = null;
        String sLine = "";
        StringTokenizer st = null;
        
        int contentCount = 0;
        
        try {
            br = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException ex) {
            handler.addLog("File not found: " +  path);
        } 

        try {
            while((sLine = br.readLine()) != null) {
                String[] splits = sLine.split(delimiter, -1);
                
                map.put(contentCount++, sLine);
                
            }
        } catch (IOException ex) {
            handler.addLog("IOException Bufferedreader");
        } 

        try {
            br.close();
        } catch (IOException ex) {
            handler.addLog("IOException FileReader close");
        }
    }

}

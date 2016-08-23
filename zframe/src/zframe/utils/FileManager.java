package zframe.utils;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.StringTokenizer;
import zframe.Handler;
import zframe.ui.todolist.Todo;
import zframe.ui.todolist.TodoList;

public class FileManager {
    
    private Handler handler;
    private Object parent;
    
    public FileManager(Handler handler, Object parent) {
        this.handler = handler;
        this.parent = parent;
    }
    
    public void writeMapToFile(String path, Map<Integer,Todo> map) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(path);
        } catch (FileNotFoundException ex) {
            handler.addLog("FileNotFoundException");
        }
        for (Todo t : map.values()) {
            
            writer.print(t.getReference() + " ");
            writer.print(t.getPrio() + " ");
            writer.print(t.getResort() + " ");
            writer.print(t.getTask() + " ");
            writer.print(t.getStart() + " ");
            writer.print(t.getEnd() + "\n");
            
        }
        writer.close();
    }
    
    public void readMapFromFile(String path, String delimiter, Map<Integer,Todo> map) {
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
                
                Todo t = new Todo(handler, (TodoList) parent, Integer.valueOf(splits[0]), Integer.valueOf(splits[1]), splits[2], splits[3], splits[4], splits[5]);
                map.put(contentCount++, t);
                
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

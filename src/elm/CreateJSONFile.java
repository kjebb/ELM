/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elm;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Kai
 */
public class CreateJSONFile
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
    JSONObject obj = new JSONObject();
    obj.put("name", "Kai Bryans");
    obj.put("location", "Edinburgh");
    
    JSONArray list = new JSONArray();
    list.add("java");
    list.add("JSP");
    list.add("servlets");
    
    obj.put("courses", list);
    
    try(FileWriter file = new FileWriter("assets/myJson.json"))
    {
        file.write(obj.toString()); // converts json to string
        file.flush();
    }
    catch(IOException e)
    {
        e.printStackTrace();
    }
    
        System.out.println(obj);
    }
    
}

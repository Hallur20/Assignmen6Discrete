import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

      BufferedReader br = Files.newBufferedReader(Paths.get("/home/hvn15/IdeaProjects/Mini-Project-Web-Services/Assignment6Discret/src/main/resources/vssl.txt"));


            // read line by line
            String line;
        HashMap<String, String> variables = new HashMap<>();

            while ((line = br.readLine()) != null) {



                if(line.contains("DEF")){
                    String varType = line.split(": ")[1];
                    String name = line.split("DEF ")[1].split(":")[0];
                    if(varType.equals("Integer") || varType.equals("Boolean")){
                        variables.put(name, "");
                    }
                }
                if(line.contains("LET")){
                    String name = line.split("LET ")[1].split(" =")[0];
                    String value = line.split("= ")[1].replace(";", "");

                }
                if(line.contains("IF")){
                    String[] cases = line.split("\\|\\||&&");
                    for (String caseString : cases){
                        caseString.replace("IF(", "");
                        System.out.println(caseString);

                    }
                    System.out.println(cases.length);
                }
            }
        System.out.println(variables.toString());

}}

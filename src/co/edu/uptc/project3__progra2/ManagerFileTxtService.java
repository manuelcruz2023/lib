package co.edu.uptc.project3__progra2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ManagerFileTxtService {
    public String fileName = "";
    public BufferedReader br;
    public String charsetName = "";

    public void setName(String fileName) {
        this.fileName = fileName;
    }

    public void setCharsetName (String charsetName) {
        this.charsetName = "UTF-8";
    }

    public void openFile() throws Exception {
        File file = new File(fileName);
        if (!file.exists()) {
            //Reader reader = new InputStreamReader(new FileInputStream(file), this.charsetName);
        } else {
            br = new BufferedReader(new FileReader(file));
        }
    }

    public List<String> readFile() throws IOException {
        String texto = "";
        List<String> list = new ArrayList<String>();
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        while ((texto = br.readLine()) != null) {
            
        }
        fr.close();
        return list;
    }

    public List<String> extraerStrings()    throws Exception {
        this.openFile();
        List<String> list = readFile();
        this.closeFile();
        return list;
    }

    public void closeFile() throws IOException{
        if (br!= null) {
            br.close();
        }
    }
}
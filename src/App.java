import co.edu.uptc.project3__progra2.ManagerFileTxtService;

public class App {
    public static void main(String[] args) throws Exception {
        ManagerFileTxtService managerFileTxtService = new ManagerFileTxtService();
        managerFileTxtService.setName("C:\\Users\\\\sala310\\\\Documents\\\\vscode manuel\\\\person2.txt");
        managerFileTxtService.openFile();
        managerFileTxtService.readFile();
    }
}

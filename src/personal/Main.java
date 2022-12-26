package personal;

import personal.controllers.UserController;
import personal.model.FileOperation;
import personal.model.FileOperationImpl;
import personal.model.Repository;
//import personal.model.RepositoryFile;
import personal.model.NewRepositoryFile;
import personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new NewRepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}

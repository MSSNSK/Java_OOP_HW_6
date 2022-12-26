package personal.model;


public class RepositoryFile extends RepositoryImpl {

    //private final UserMapper mapper = new UserMapper();

    public RepositoryFile(FileOperation fileOperation) {
        super(fileOperation, new UserMapper());
    }

    
}

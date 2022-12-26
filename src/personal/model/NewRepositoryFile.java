package personal.model;

public class NewRepositoryFile extends RepositoryImpl{
    //private final NewUserMapper mapper = new NewUserMapper();
    public NewRepositoryFile(FileOperation fileOperation) {
        super(fileOperation, new NewUserMapper());
    }
}

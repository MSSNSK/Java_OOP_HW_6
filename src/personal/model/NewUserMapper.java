package personal.model;

public class NewUserMapper extends UserMapper{
    @Override
    public User map(String line) {
        String[] lines = line.replace(";"," ").replace(","," ").split(" ");
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}

1) Добавила абстрактный класс RepositoryImpl.java, который имплементирует методы интерфейса Repository.java
2) RepositiryFile.java и NewRepositoryFile.java наследуют абстрактный класс RepositoryImpl.java. Это помогло убрать дублирование кода в классах RepositiryFile.java, NewRepositoryFile.java.

3) NewUserMapper.java наследник от UserMapper.java - это помогло избежать дублирование кода. 
4) Переопределила метод map в классе NewUserMapper.java

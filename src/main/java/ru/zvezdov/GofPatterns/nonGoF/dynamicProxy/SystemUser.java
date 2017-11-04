package ru.zvezdov.GofPatterns.nonGoF.dynamicProxy;

/**
 * @author Dmitry Zvezdov
 *         04.11.2017.
 */
class SystemUser implements User {

    private Long id;
    private String name;

    public SystemUser(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String rename(String newName) {
        return this.name = newName;
    }
}

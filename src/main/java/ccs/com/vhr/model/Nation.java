package ccs.com.vhr.model;

public class Nation {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nation.id
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nation.name
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nation.id
     *
     * @return the value of nation.id
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nation.id
     *
     * @param id the value for nation.id
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nation.name
     *
     * @return the value of nation.name
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nation.name
     *
     * @param name the value for nation.name
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}
package com.example.demo.domain;

public class T1 {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_1.id
     *
     * @mbg.generated Tue May 24 14:20:02 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_1.name
     *
     * @mbg.generated Tue May 24 14:20:02 CST 2022
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_1.id
     *
     * @return the value of t_1.id
     *
     * @mbg.generated Tue May 24 14:20:02 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_1.id
     *
     * @param id the value for t_1.id
     *
     * @mbg.generated Tue May 24 14:20:02 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_1.name
     *
     * @return the value of t_1.name
     *
     * @mbg.generated Tue May 24 14:20:02 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_1.name
     *
     * @param name the value for t_1.name
     *
     * @mbg.generated Tue May 24 14:20:02 CST 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}
class AStudent {
    private String name;
    private int age;     //need to private 
    public void setName(String inName) {//setter
        name = inName;
    }
    public String getName() {           //getter
        return name;
    }
    public int getAge(){return age;}    //getter
    public void setAge(int a){          //setter with condition
        if (a<0){
            System.out.println("the inputted age is invalid default set to 18");//error message
            age = 18;                   //default age
        }
        else 
            age = a;                    //nothing wrong 
    }
}

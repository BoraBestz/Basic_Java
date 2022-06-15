public class Programmer extends Employee implements JobDetail{
    public void showProgrammer() {
        setId("50");
        setName("BabyBest");
        setSalary(300000.0);
    }
    //overloading method
    public void skill() {
        System.out.println("no skill");
    }
    public void skill(String language){
        System.out.println("Skill = "+language);
    }
    public void skill(String l1,String l2){
        System.out.println("Skill = "+l1+" "+l2);
    }
    public void skill(String...language){
        for(int i=0;i<language.length;i++){
            System.out.println("Skill ="+language[i]);
        }
    }

    //override
    @Override
    public void bonus(){
        System.out.println("Bonus = 20%");
    }

    @Override
    public void working(String working) {
        System.out.println("coding");
    }
}

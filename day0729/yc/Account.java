package day0729.yc;

public class Account {
    private String name;
    private String no;
    private String password;
    private double money;

        public String getPassword(){
            return password;
        }
        public void setPassword(String password){
            this.password=password;
        }

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name=name;
        }

        public double getMoney(){
            return money;
        }
        public void setMoney(double money){
            this.money=money;
        }

        public String getNo(){
            return no;
        }
        public void setNo(String no){
            this.no=no;
        }

}


public class task1 {
    
public static void main(String[] args) {
    int num1 = 10;
    int num2 = 5;
    
    try{
        if(num2 == 0){
            System.out.println("Ошибка: Делить на ноль нельзя");
        }else{
            int result = num1/num2;
            System.out.println("Результат = " + result);
        }
    }catch(Exception e){
        System.out.println("Error: " + e.getMessage());
    }
}

    
}


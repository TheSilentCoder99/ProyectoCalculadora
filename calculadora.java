class Calculadora{

    private int num1;
    private int num2;

    Calculadora(){
    }

    public int suma(int num1, int num2){
        
        return num1+num2;
    }

    public int multiplicacion(int num1, int num2){

        return num1*num2;
    }

    public void dividir(int num1, int num2){

        double resultDiv = num1/num2;

        if(num1 == 0){
            System.out.println(0);

        } else if(num2 == 0){

            System.out.println("No se puede dividir entre 0");
        } 
        else{

            System.out.println(resultDiv);
        }
        
    }


}
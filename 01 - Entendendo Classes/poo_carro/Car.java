public class Car{
    //atributos são privados pois encapsulo eles e nao acesso diretamente, mas sim pelo setter
    private int pass; // Passageiros
    //contante de limite
    private final int PASS_MAX = 2; // limite de Passageiros suporta ate 2
    private final int GAS_MAX = 100; // limite do tanque
    
    private int gas; // tanque
    private int km; // quantidade de quilometragem

    @Override
    public String toString() {
        return "pass: " + pass + ", gas: " + gas + ", km: " + km;
    }

    public Car() {
        this.gas = 0;
        this.pass = 0;
        this.km = 0;
    }

    public void enter() {
        //se a quatidade de passageiros é igual ao limite 
        if(pass == PASS_MAX){
            System.out.println("fail: limite de pessoas atingido");
        }  
        else { //adiciona o passageiro
            pass++;
        }
    }

    public void leave() {
        //se nao há nenhum passageiro 
        if(pass == 0){
            System.out.println("fail: nao ha ninguem no carro");
        } else { //se há, remove o passageiro
            pass--;
        }
    }

    public void fuel(int addGas) {
        //se o tanque já estiver cheio 
        if(gas == GAS_MAX){
            return; //nao precisa abstecer 
        } 
        /*como nao caiu no if anterior, o tanque não esta cheiro,
         * deve ser abastecido
        */
        else {
            if(gas + addGas > GAS_MAX){ //se a quatidade do abastecimento vai exceder
                gas = GAS_MAX; //para quando chegar no MAX
                return;
            }
            gas += addGas; //abastece normalmente
        }
             
    }

    public void drive(int addKm){
        //verificações iniciais que podem me impedir de andar
        if(pass == 0){ //se nao há ninguem no carro
            System.out.println("fail: nao ha ninguem no carro");
            return;
        } else if(gas == 0){ //se nao ha gas
            System.out.println("fail: tanque vazio");
            return;
        }
        
        if(addKm > gas){ //se quero andar mais km do que consigo 
            System.out.println("fail: tanque vazio apos andar " + gas + " km"); //a quntidade de km andado é a quantidade de gas que eu tinha 
            km += gas; //andei a quatidade de km correspondente ao meu gas
            gas = 0; //fiquei no prego sem gas
        }
        //a quantidade de gas é suficiente pra eu andar os km que quero
        else {
            //acumulo os km que andei
            km += addKm;
            //subtraio a quatidade de gas que gastei pra percorrer os km
            gas -= addKm;
        }
    }   
}

package produtorconsumidor;

/**
 *
 * @author viniciuscoelho, thaismombach
 */

public class MainConsumidor {
    
    // manager ip address and its listening port
    public static void main(String []args){
        if ( args.length != 2 ){
            System.out.println("Wrong number of arguments!");
            System.exit(1);
        }
        else {
            String ip = args[0];
            Integer port = Integer.parseInt(args[1]);

            Consumidor c = new Consumidor(ip, port);
            Thread t1 = new Thread(c);

            t1.start();
        }
    }
}

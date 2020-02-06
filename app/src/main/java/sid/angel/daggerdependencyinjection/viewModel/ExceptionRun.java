package sid.angel.daggerdependencyinjection.viewModel;

import android.os.Build;
import android.os.DeadSystemException;

import androidx.annotation.RequiresApi;

public class ExceptionRun {


    @RequiresApi(api = Build.VERSION_CODES.N)
    static void fun()
    {
        try
        {
            String name = null;
          System.out.println(name.length());
//        throw new     NullPointerException("Demo")
           // throw new DeadSystemException();
        }
//        catch(NullPointerException e)
//        {
//            System.out.println("Caught inside fun().");
//         //   throw e; // rethrowing the exception
//        }
        catch (NullPointerException de){
            System.out.println("Caught dead inside fun().");
        }
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {

        fun();


    }
}

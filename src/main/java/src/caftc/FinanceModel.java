package src.caftc;

import java.lang.invoke.SwitchPoint;
import java.sql.Timestamp;
import src.caftc.Operator;

public class FinanceModel {

    public double Calculate (double thanksGiving,  double generalOffering, double foundation, char Operator ){
        switch (Operator){
            case '+':
                return thanksGiving+generalOffering+foundation;
            case '-':
                return thanksGiving-generalOffering-foundation;
            case '*':
                return thanksGiving*generalOffering*foundation;
            case '/':
                return thanksGiving/generalOffering/foundation;
        }
        return 0;
    }
}

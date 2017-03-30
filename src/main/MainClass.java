package main;

import interfaces.Workable;
import model.Designer;
import model.Developer;
import model.Tester;

/**
 * Created by RafaelLopez on 3/30/17.
 */
public class MainClass
{
    public static void main(String arguments[]) {
        // Worker of Type Developer
        final Workable developer = new Developer();
        executeWork(developer);

        // Worker of Type Developer
        final Workable designer = new Designer();
        executeWork(designer);

        // Worker of Type Tester
        final Workable tester = new Tester();
        executeWork(tester);
    }

    private static void executeWork(final Workable worker){
        worker.work();
    }
}

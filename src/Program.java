import eksempelklasser.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) throws IOException
    {

        Student[] s = new Student[5];                             // en studenttabell
        s[0] = new Student("Kari","Svendsen", Studium.Data);      // Kari Svendsen
        s[1] = new Student("Boris","Zukanovic", Studium.IT);      // Boris Zukanovic
        s[2] = new Student("Ali","Kahn", Studium.Anvendt);        // Ali Kahn
        s[3] = new Student("Azra","Zukanovic", Studium.IT);       // Azra Zukanovic
        s[4] = new Student("Kari","Pettersen", Studium.Data);     // Kari Pettersen

        Tabell.innsettingssortering(s,
                (s1,s2) ->
                {
                    int k = s1.studium().compareTo(s2.studium());
                    if (k != 0) return k;
                    k = s1.fornavn().compareTo(s2.fornavn());
                    if (k != 0) return k;
                    return s1.etternavn().compareTo(s2.etternavn());
                }
        );
        for (Student t : s) System.out.println(t);
    }
 }


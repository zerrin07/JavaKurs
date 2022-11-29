
public class Cylinder {
 int yaricap = 1;
 int yükseklik= 1;
 double pi = 3.14;


public double hacim()
{
 double hacim = pi * (yaricap*yaricap) * yükseklik;
 return hacim;
 
}
public double alan()
{
 double alan = 2 * pi * yaricap * (yaricap + yükseklik);
 return alan;

}
}

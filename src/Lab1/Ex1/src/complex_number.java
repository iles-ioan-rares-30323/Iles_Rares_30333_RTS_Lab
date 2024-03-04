public class complex_number
{
    private int x,y;

    public void set_x(int x) {
        this.x = x;
    }

    public void set_y(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void add (complex_number A, complex_number B, complex_number result)
    {
        result.x = A.x + B.x;
        result.y = A.y + B.y;
    }

    public void subtract(complex_number A, complex_number B, complex_number result)
    {
        result.x = A.x - B.x;
        result.y = A.y - B.y;
    }

    public void multiply (complex_number A, complex_number B, complex_number result)
    {
        result.x = A.x * B.x - A.y * B.y;
        result.y = A.x * B.y + A.y * B.x;
    }
    public void to_string()
    {
        if(this.x > 0) System.out.print(" " + this.x);
        else System.out.print(" - " + -this.x);

        if(this.y > 0) System.out.print(" + " + this.y + "i ");
        else System.out.print(" - " + -this.y + "i ");
    }
}

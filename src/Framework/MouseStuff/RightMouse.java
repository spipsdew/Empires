package Framework.MouseStuff;

import Framework.Handler;

public class RightMouse
{
    private Handler h;
    private Mouse mouse;

    public RightMouse(Handler h, Mouse mouse)
    {
        this.h = h;
        this.mouse = mouse;
    }

    public void pressed()
    {

    }

    public void released()
    {

    }

    public void clicked()
    {
        h.getBoard().moveSelected();
    }

    public void held()
    {

    }
}

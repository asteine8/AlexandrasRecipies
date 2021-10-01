public class DirtBlock implements Cube, Block, SpicyCube, WormySolid, Dirt{
}

interface Block {
}

interface Dirt {
}

public class DirtBlock extends Block, Dirt {
    public DirtBlock() {
        display(this); // Ohno! Do we call Thing.display or Dirt.display? We don't know which one to call qwq
    }
}
public class Block extends Thing {
}
public class Dirt extends Thing {
    public static void display(Thing t);
}
public class Thing {
    public static void display(Thing t);
}
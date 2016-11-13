package cbt;
import java.io.*;

public abstract class BuildInterface implements Dependency{
  public abstract BuildInterface finalBuild(); // needed to propagage through build builds. Maybe we can get rid of this.
  public abstract File[] triggerLoopFilesArray(); // needed for watching files across composed builds
}

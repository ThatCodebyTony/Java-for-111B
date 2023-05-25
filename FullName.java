// Tony Wu

class FullName extends Name {
  private String mName;

  public FullName(String f, String m, String l) {
    super(f, l);
    mName = m;
  }

  @Override
  public String toString() {
    return f + " " + mName + " " + l;
  }
}
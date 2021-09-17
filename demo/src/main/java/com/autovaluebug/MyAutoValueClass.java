package com.autovaluebug;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class MyAutoValueClass extends ParentClass {
  public abstract int beta();

  public static AutoValue_MyAutoValueClass create(byte alpha, int beta, int gamma) {
    return new AutoValue_MyAutoValueClass(gamma, alpha, beta);
    // When you save and autobuild with vscode this order becomes:
    // return new AutoValue_MyAutoValueClass(alpha, gamma, beta);
  }
}

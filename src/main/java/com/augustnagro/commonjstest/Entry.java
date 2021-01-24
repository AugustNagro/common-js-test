package com.augustnagro.commonjstest;

import elemental2.core.JsObject;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "EntryPoint", namespace = "com.augustnagro.commonjstest")
public class Entry {
  
  public static native double area(double radius);
}

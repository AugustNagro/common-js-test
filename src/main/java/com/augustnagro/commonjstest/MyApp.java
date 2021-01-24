package com.augustnagro.commonjstest;

import elemental2.dom.*;
import jsinterop.annotations.JsType;

@JsType
public class MyApp {
  
  public static void main() {
    DomGlobal.document.getElementById("content").textContent = "" + Entry.area(5.0);
  }
  
}

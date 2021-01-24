circle.js is a CommonJS module, it is require()'d and exported in entrypoint.js (which is a goog.module). Finally,
the entrypoint.js module is mapped to the @JsType Entry.java.

If you run `mvn package`, this is very close to working. However, if you open index.html in a browser,
the program is ordered wrong!

Note that j2clmavenplugin was modified to `--process_common_js_modules`; please `git cherry-pick` this commit: https://github.com/AugustNagro/j2clmavenplugin/commit/d18490fccd545e860bd2d67954443593452bbae8

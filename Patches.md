# Patches of errors found by analysis/testing

## Error I

```patch
diff --git a/ClassifyTriangle.java b/ClassifyTriangle.java
index 6459fa2..f68c975 100644
--- a/ClassifyTriangle.java
+++ b/ClassifyTriangle.java
@@ -27,7 +27,7 @@ class ClassifyTriangle {
           Integer.parseInt(args[1]),
           Integer.parseInt(args[2])
       ));
-    } catch (java.lang.ArrayIndexOutOfBoundsException excpetion) {
+    } catch (java.lang.ArrayIndexOutOfBoundsException exception) {
       System.out.println(triTypes[3]);
```
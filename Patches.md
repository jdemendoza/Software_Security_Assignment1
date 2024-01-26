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
## Error II

```patch
diff --git a/ClassifyTriangle.java b/ClassifyTriangle.java
index f68c975..e67257c 100644
--- a/ClassifyTriangle.java
+++ b/ClassifyTriangle.java
@@ -53,7 +53,7 @@ class ClassifyTriangle {
 
     // After a quick confirmation that it's a legal
     // triangle, detect any sides of equal length
-    if (Side1 < 1 | Side2 <= 1 | Side3 <= 0) {
+    if (Side1 < 1 || Side2 <= 1 || Side3 <= 0) {
        triOut = 3;
        return (triTypes[triOut]);
     }

```

## Error III

```patch
diff --git a/ClassifyTriangle.java b/ClassifyTriangle.java
index e67257c..9fcf929 100644
--- a/ClassifyTriangle.java
+++ b/ClassifyTriangle.java
@@ -69,7 +69,7 @@ class ClassifyTriangle {
       // Confirm it's a legal triangle before declaring
       // it to be scalene
 
-      if (Side1 <= Side3-Side2 | Side2 <= Side1-Side3 |
+      if (Side1 <= Side3-Side2 || Side2 <= Side1-Side3 ||
           Side3 <= Side2-Side1)
         triOut = 3;

```

## Error IV

```patch
diff --git a/ClassifyTriangle.java b/ClassifyTriangle.java
index 9fcf929..8dfa5eb 100644
--- a/ClassifyTriangle.java
+++ b/ClassifyTriangle.java
@@ -83,7 +83,7 @@ class ClassifyTriangle {
 
     if (triOut > 2)
       triOut = 2;
-    else if (triOut == 0 & Side1+Side2 > Side3)
+    else if (triOut == 0 && Side1+Side2 > Side3)
       triOut = 1;
     else if (triOut == 1 & Side1 > Side2-Side3)
       triOut = 1;
```

## Error V

```patch
diff --git a/ClassifyTriangle.java b/ClassifyTriangle.java
index 8dfa5eb..493ed21 100644
--- a/ClassifyTriangle.java
+++ b/ClassifyTriangle.java
@@ -85,7 +85,7 @@ class ClassifyTriangle {
       triOut = 2;
     else if (triOut == 0 && Side1+Side2 > Side3)
       triOut = 1;
-    else if (triOut == 1 & Side1 > Side2-Side3)
+    else if (triOut == 1 && Side1 > Side2-Side3)
       triOut = 1;
     else if (triOut == 2 & Side2 > Side1-Side3)
       triOut = 1;
```

## Error VI

```patch
diff --git a/ClassifyTriangle.java b/ClassifyTriangle.java
index 493ed21..2710c8c 100644
--- a/ClassifyTriangle.java
+++ b/ClassifyTriangle.java
@@ -87,7 +87,7 @@ class ClassifyTriangle {
       triOut = 1;
     else if (triOut == 1 && Side1 > Side2-Side3)
       triOut = 1;
-    else if (triOut == 2 & Side2 > Side1-Side3)
+    else if (triOut == 2 && Side2 > Side1-Side3)
       triOut = 1;
     else
       triOut = 3;
```

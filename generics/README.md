# Generics

Text taken from the [Java Tutorials](https://docs.oracle.com/javase/tutorial/java/generics/index.html).

Generics enable types to be parameters when defining classes, interfaces and methods. Much like the more familiar
**formal parameters** used in method declarations, **type parameters** provide a way for you to re-use the same code
with different inputs. The difference is that the inputs to formal parameters are values, while the inputs to type
parameters are types.

## Parameters

Parameters refer to the variables which act as placeholders in code.

```
// <T> here is known as a type parameter
public class Box<T> {
    // ...
}
```

## Arguments

Arguments refer to the actual values or variables in client code.

```
// <String> here is a type argument
Box<String> box = new Box<>();
```

## Raw types

A raw type is the name of a generic class or interface without any type arguments. For example given the generic `Box`
class:

```
public class Box<T> {
    public void set(T t) {
        // ...
    }
}
```

To create a parameterised type of ```Box<T>```, you supply an actual type argument for the formal parameter `T`:

```
Box<Integer> intBox = new Box<>();
```

If the actual type is omitted, you get a raw type of `Box<T>`:

```
Box rawBox = new Box();
```

Therefore, `Box` is the raw type of `Box<T>`. However, a non-generic class is _not_ a raw type.

## Generic methods

Generic methods are methods that introduce their own type paremeters. The type parameter's scope is limited to the
method where it is declared. Static and non-static generic methods are allowed, as well as generic class constructors.

```
public class Util {
    public static <K, V> boolean compare(Pair<K, V>, p1, Pair<K, V> p2) {
        // ...
    }
}
```

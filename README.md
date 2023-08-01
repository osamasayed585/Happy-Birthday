# Jetpack Compose tutorial
Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.
In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.

# Jetpack Compose — Introduction
- if you have an existing app that already has legacy code using XML to migrate to compose is not something difficult to do. Compose has interoperability with Views. So that compose can be used together in one project. It could even be on one page consisting of XML and compose. There are two ways to migrate the layout from XML to jetpack compose. Compose has the ability to adapt and coexist with XML and View systems (Interoperability). In other words, we can combine layouts built with XML with Compose.

- Modifiers tell UI elements how to arrange, display, or behave in the parent layout. In addition, modifiers are able to decorate or add behavior to UI elements.
`fillMaxWidth`, sets the max width similar to match_parent in xml.
`fillMaxHeight`, sets the max height similar to match_parent in xml.
`background`, set the screen background color

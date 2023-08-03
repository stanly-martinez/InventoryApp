<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Inventory App</title>
    <!-- intercessions css and javascript -->
</head>
<body>
<header>
    <!--Encabezado o menu de navegacion-->
    <h1>Bienvenido a Aplicacion de seguimiento de inventario</h1>
    <!--Can add navigation menu or relevants enlaces-->
</header>

<main>
    <!-- Agrega aquí el contenido principal de tu página -->
    <p>Esta es la página de inicio de tu aplicación.</p>
    <!-- Puedes mostrar información relevante, estadísticas, etc. -->

    <!-- Aquí puedes agregar formularios para agregar, editar o eliminar elementos del inventario -->
    <!-- Por ejemplo, un formulario para agregar un nuevo producto -->
    <form action="addProduct" method="post">
        <label for="nombre">Nombre del Producto:</label>
        <input type="text" id="nombre" name="nombre" required>
        <!-- Agrega otros campos del formulario, como precio, categoría, proveedor, etc. -->
        <button type="submit">Agregar Producto</button>
    </form>

    <!-- Aquí puedes mostrar una tabla con los productos del inventario -->
    <table>
        <thead>
        <tr>
            <th>Nombre del Producto</th>
            <th>Precio</th>
            <th>Categoría</th>
            <th>Proveedor</th>
            <!-- Agrega más columnas si es necesario -->
        </tr>
        </thead>
        <tbody>
        <!-- Puedes mostrar los datos de los productos desde la base de datos aquí -->
        <!-- Por ejemplo, puedes utilizar JSTL (JavaServer Pages Standard Tag Library) para iterar sobre una lista de productos -->
        <!-- <%-- <c:forEach items="${listaProductos}" var="producto"> --%> -->
        <!-- <%--     <tr> --%> -->
        <!-- <%--         <td>${producto.nombre}</td> --%> -->
        <!-- <%--         <td>${producto.precio}</td> --%> -->
        <!-- <%--         <td>${producto.categoria.nombre}</td> --%> -->
        <!-- <%--         <td>${producto.proveedor.nombre}</td> --%> -->
        <!-- <%--     </tr> --%> -->
        <!-- <%-- </c:forEach> --%> -->
        </tbody>
    </table>
</main>

<footer>
    <!--Pie de pagina-->
    <p>Derechos de autor © 2023 - Pizzaroni Enterprise</p>
</footer>
</body>
</html>
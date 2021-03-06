PGDMP     1                     w           sistema    11.1    11.1 G    \           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            ]           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            ^           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            _           1262    16393    sistema    DATABASE     �   CREATE DATABASE sistema WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Spain.1252' LC_CTYPE = 'Spanish_Spain.1252';
    DROP DATABASE sistema;
             postgres    false            �            1259    16412 
   categorias    TABLE     z   CREATE TABLE public.categorias (
    id_categoria integer NOT NULL,
    descripcion character(100),
    activo integer
);
    DROP TABLE public.categorias;
       public         postgres    false            �            1259    16410    categorias_id_categoria_seq    SEQUENCE     �   CREATE SEQUENCE public.categorias_id_categoria_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE public.categorias_id_categoria_seq;
       public       postgres    false    201            `           0    0    categorias_id_categoria_seq    SEQUENCE OWNED BY     [   ALTER SEQUENCE public.categorias_id_categoria_seq OWNED BY public.categorias.id_categoria;
            public       postgres    false    200            �            1259    16444    clientes    TABLE       CREATE TABLE public.clientes (
    id_cliente integer NOT NULL,
    cedula integer NOT NULL,
    ruc character(100) NOT NULL,
    nombre character(100),
    apellido character(100) NOT NULL,
    telefono character(100) NOT NULL,
    correo character(100) NOT NULL,
    activo integer
);
    DROP TABLE public.clientes;
       public         postgres    false            �            1259    16442    clientes_id_cliente_seq    SEQUENCE     �   CREATE SEQUENCE public.clientes_id_cliente_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.clientes_id_cliente_seq;
       public       postgres    false    207            a           0    0    clientes_id_cliente_seq    SEQUENCE OWNED BY     S   ALTER SEQUENCE public.clientes_id_cliente_seq OWNED BY public.clientes.id_cliente;
            public       postgres    false    206            �            1259    16404    marcas    TABLE     r   CREATE TABLE public.marcas (
    id_marca integer NOT NULL,
    descripcion character(100),
    activo integer
);
    DROP TABLE public.marcas;
       public         postgres    false            �            1259    16402    marcas_id_marca_seq    SEQUENCE     �   CREATE SEQUENCE public.marcas_id_marca_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.marcas_id_marca_seq;
       public       postgres    false    199            b           0    0    marcas_id_marca_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.marcas_id_marca_seq OWNED BY public.marcas.id_marca;
            public       postgres    false    198            �            1259    16433    proveedores    TABLE     �   CREATE TABLE public.proveedores (
    id_proveedor integer NOT NULL,
    nombre character(100),
    ruc character(100),
    telefono character(100) NOT NULL,
    correo character(100) NOT NULL,
    direccion character(100) NOT NULL,
    activo integer
);
    DROP TABLE public.proveedores;
       public         postgres    false            �            1259    16431    proveedores_id_proveedor_seq    SEQUENCE     �   CREATE SEQUENCE public.proveedores_id_proveedor_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 3   DROP SEQUENCE public.proveedores_id_proveedor_seq;
       public       postgres    false    205            c           0    0    proveedores_id_proveedor_seq    SEQUENCE OWNED BY     ]   ALTER SEQUENCE public.proveedores_id_proveedor_seq OWNED BY public.proveedores.id_proveedor;
            public       postgres    false    204            �            1259    16484    roles    TABLE     o   CREATE TABLE public.roles (
    id_rol integer NOT NULL,
    descripcion character(100),
    activo integer
);
    DROP TABLE public.roles;
       public         postgres    false            �            1259    16482    roles_id_rol_seq    SEQUENCE     �   CREATE SEQUENCE public.roles_id_rol_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.roles_id_rol_seq;
       public       postgres    false    213            d           0    0    roles_id_rol_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.roles_id_rol_seq OWNED BY public.roles.id_rol;
            public       postgres    false    212            �            1259    16420    subcategorias    TABLE     �   CREATE TABLE public.subcategorias (
    id_subcategoria integer NOT NULL,
    descripcion character(100),
    id_categoria integer,
    activo integer
);
 !   DROP TABLE public.subcategorias;
       public         postgres    false            �            1259    16418 !   subcategorias_id_subcategoria_seq    SEQUENCE     �   CREATE SEQUENCE public.subcategorias_id_subcategoria_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 8   DROP SEQUENCE public.subcategorias_id_subcategoria_seq;
       public       postgres    false    203            e           0    0 !   subcategorias_id_subcategoria_seq    SEQUENCE OWNED BY     g   ALTER SEQUENCE public.subcategorias_id_subcategoria_seq OWNED BY public.subcategorias.id_subcategoria;
            public       postgres    false    202            �            1259    16396 
   sucursales    TABLE     t   CREATE TABLE public.sucursales (
    id_sucursal integer NOT NULL,
    nombre character(100),
    activo integer
);
    DROP TABLE public.sucursales;
       public         postgres    false            �            1259    16394    sucursales_id_sucursal_seq    SEQUENCE     �   CREATE SEQUENCE public.sucursales_id_sucursal_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.sucursales_id_sucursal_seq;
       public       postgres    false    197            f           0    0    sucursales_id_sucursal_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.sucursales_id_sucursal_seq OWNED BY public.sucursales.id_sucursal;
            public       postgres    false    196            �            1259    16468    usuarios    TABLE     �   CREATE TABLE public.usuarios (
    id_usuario integer NOT NULL,
    nombre_apellido character(100),
    usuario character(100),
    pass character(999),
    id_sucursal integer,
    id_rol integer,
    activo integer
);
    DROP TABLE public.usuarios;
       public         postgres    false            �            1259    16466    usuarios_id_usuario_seq    SEQUENCE     �   CREATE SEQUENCE public.usuarios_id_usuario_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.usuarios_id_usuario_seq;
       public       postgres    false    211            g           0    0    usuarios_id_usuario_seq    SEQUENCE OWNED BY     S   ALTER SEQUENCE public.usuarios_id_usuario_seq OWNED BY public.usuarios.id_usuario;
            public       postgres    false    210            �            1259    16455 
   vendedores    TABLE     �   CREATE TABLE public.vendedores (
    id_vendedor integer NOT NULL,
    nombre character(100),
    apellido character(100),
    cedula integer NOT NULL,
    id_sucursal integer,
    activo integer
);
    DROP TABLE public.vendedores;
       public         postgres    false            �            1259    16453    vendedores_id_vendedor_seq    SEQUENCE     �   CREATE SEQUENCE public.vendedores_id_vendedor_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.vendedores_id_vendedor_seq;
       public       postgres    false    209            h           0    0    vendedores_id_vendedor_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.vendedores_id_vendedor_seq OWNED BY public.vendedores.id_vendedor;
            public       postgres    false    208            �
           2604    16415    categorias id_categoria    DEFAULT     �   ALTER TABLE ONLY public.categorias ALTER COLUMN id_categoria SET DEFAULT nextval('public.categorias_id_categoria_seq'::regclass);
 F   ALTER TABLE public.categorias ALTER COLUMN id_categoria DROP DEFAULT;
       public       postgres    false    201    200    201            �
           2604    16447    clientes id_cliente    DEFAULT     z   ALTER TABLE ONLY public.clientes ALTER COLUMN id_cliente SET DEFAULT nextval('public.clientes_id_cliente_seq'::regclass);
 B   ALTER TABLE public.clientes ALTER COLUMN id_cliente DROP DEFAULT;
       public       postgres    false    206    207    207            �
           2604    16407    marcas id_marca    DEFAULT     r   ALTER TABLE ONLY public.marcas ALTER COLUMN id_marca SET DEFAULT nextval('public.marcas_id_marca_seq'::regclass);
 >   ALTER TABLE public.marcas ALTER COLUMN id_marca DROP DEFAULT;
       public       postgres    false    199    198    199            �
           2604    16436    proveedores id_proveedor    DEFAULT     �   ALTER TABLE ONLY public.proveedores ALTER COLUMN id_proveedor SET DEFAULT nextval('public.proveedores_id_proveedor_seq'::regclass);
 G   ALTER TABLE public.proveedores ALTER COLUMN id_proveedor DROP DEFAULT;
       public       postgres    false    204    205    205            �
           2604    16487    roles id_rol    DEFAULT     l   ALTER TABLE ONLY public.roles ALTER COLUMN id_rol SET DEFAULT nextval('public.roles_id_rol_seq'::regclass);
 ;   ALTER TABLE public.roles ALTER COLUMN id_rol DROP DEFAULT;
       public       postgres    false    213    212    213            �
           2604    16423    subcategorias id_subcategoria    DEFAULT     �   ALTER TABLE ONLY public.subcategorias ALTER COLUMN id_subcategoria SET DEFAULT nextval('public.subcategorias_id_subcategoria_seq'::regclass);
 L   ALTER TABLE public.subcategorias ALTER COLUMN id_subcategoria DROP DEFAULT;
       public       postgres    false    202    203    203            �
           2604    16399    sucursales id_sucursal    DEFAULT     �   ALTER TABLE ONLY public.sucursales ALTER COLUMN id_sucursal SET DEFAULT nextval('public.sucursales_id_sucursal_seq'::regclass);
 E   ALTER TABLE public.sucursales ALTER COLUMN id_sucursal DROP DEFAULT;
       public       postgres    false    196    197    197            �
           2604    16471    usuarios id_usuario    DEFAULT     z   ALTER TABLE ONLY public.usuarios ALTER COLUMN id_usuario SET DEFAULT nextval('public.usuarios_id_usuario_seq'::regclass);
 B   ALTER TABLE public.usuarios ALTER COLUMN id_usuario DROP DEFAULT;
       public       postgres    false    211    210    211            �
           2604    16458    vendedores id_vendedor    DEFAULT     �   ALTER TABLE ONLY public.vendedores ALTER COLUMN id_vendedor SET DEFAULT nextval('public.vendedores_id_vendedor_seq'::regclass);
 E   ALTER TABLE public.vendedores ALTER COLUMN id_vendedor DROP DEFAULT;
       public       postgres    false    208    209    209            M          0    16412 
   categorias 
   TABLE DATA               G   COPY public.categorias (id_categoria, descripcion, activo) FROM stdin;
    public       postgres    false    201   �P       S          0    16444    clientes 
   TABLE DATA               g   COPY public.clientes (id_cliente, cedula, ruc, nombre, apellido, telefono, correo, activo) FROM stdin;
    public       postgres    false    207   Q       K          0    16404    marcas 
   TABLE DATA               ?   COPY public.marcas (id_marca, descripcion, activo) FROM stdin;
    public       postgres    false    199   $Q       Q          0    16433    proveedores 
   TABLE DATA               e   COPY public.proveedores (id_proveedor, nombre, ruc, telefono, correo, direccion, activo) FROM stdin;
    public       postgres    false    205   AQ       Y          0    16484    roles 
   TABLE DATA               <   COPY public.roles (id_rol, descripcion, activo) FROM stdin;
    public       postgres    false    213   ^Q       O          0    16420    subcategorias 
   TABLE DATA               [   COPY public.subcategorias (id_subcategoria, descripcion, id_categoria, activo) FROM stdin;
    public       postgres    false    203   {Q       I          0    16396 
   sucursales 
   TABLE DATA               A   COPY public.sucursales (id_sucursal, nombre, activo) FROM stdin;
    public       postgres    false    197   �Q       W          0    16468    usuarios 
   TABLE DATA               k   COPY public.usuarios (id_usuario, nombre_apellido, usuario, pass, id_sucursal, id_rol, activo) FROM stdin;
    public       postgres    false    211   �Q       U          0    16455 
   vendedores 
   TABLE DATA               `   COPY public.vendedores (id_vendedor, nombre, apellido, cedula, id_sucursal, activo) FROM stdin;
    public       postgres    false    209   �Q       i           0    0    categorias_id_categoria_seq    SEQUENCE SET     J   SELECT pg_catalog.setval('public.categorias_id_categoria_seq', 1, false);
            public       postgres    false    200            j           0    0    clientes_id_cliente_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.clientes_id_cliente_seq', 1, false);
            public       postgres    false    206            k           0    0    marcas_id_marca_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.marcas_id_marca_seq', 1, false);
            public       postgres    false    198            l           0    0    proveedores_id_proveedor_seq    SEQUENCE SET     K   SELECT pg_catalog.setval('public.proveedores_id_proveedor_seq', 1, false);
            public       postgres    false    204            m           0    0    roles_id_rol_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.roles_id_rol_seq', 1, false);
            public       postgres    false    212            n           0    0 !   subcategorias_id_subcategoria_seq    SEQUENCE SET     P   SELECT pg_catalog.setval('public.subcategorias_id_subcategoria_seq', 1, false);
            public       postgres    false    202            o           0    0    sucursales_id_sucursal_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.sucursales_id_sucursal_seq', 1, false);
            public       postgres    false    196            p           0    0    usuarios_id_usuario_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.usuarios_id_usuario_seq', 1, false);
            public       postgres    false    210            q           0    0    vendedores_id_vendedor_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.vendedores_id_vendedor_seq', 1, false);
            public       postgres    false    208            �
           2606    16417    categorias categorias_pkey 
   CONSTRAINT     b   ALTER TABLE ONLY public.categorias
    ADD CONSTRAINT categorias_pkey PRIMARY KEY (id_categoria);
 D   ALTER TABLE ONLY public.categorias DROP CONSTRAINT categorias_pkey;
       public         postgres    false    201            �
           2606    16452    clientes clientes_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.clientes
    ADD CONSTRAINT clientes_pkey PRIMARY KEY (id_cliente);
 @   ALTER TABLE ONLY public.clientes DROP CONSTRAINT clientes_pkey;
       public         postgres    false    207            �
           2606    16409    marcas marcas_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.marcas
    ADD CONSTRAINT marcas_pkey PRIMARY KEY (id_marca);
 <   ALTER TABLE ONLY public.marcas DROP CONSTRAINT marcas_pkey;
       public         postgres    false    199            �
           2606    16441    proveedores proveedores_pkey 
   CONSTRAINT     d   ALTER TABLE ONLY public.proveedores
    ADD CONSTRAINT proveedores_pkey PRIMARY KEY (id_proveedor);
 F   ALTER TABLE ONLY public.proveedores DROP CONSTRAINT proveedores_pkey;
       public         postgres    false    205            �
           2606    16489    roles roles_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.roles
    ADD CONSTRAINT roles_pkey PRIMARY KEY (id_rol);
 :   ALTER TABLE ONLY public.roles DROP CONSTRAINT roles_pkey;
       public         postgres    false    213            �
           2606    16425     subcategorias subcategorias_pkey 
   CONSTRAINT     k   ALTER TABLE ONLY public.subcategorias
    ADD CONSTRAINT subcategorias_pkey PRIMARY KEY (id_subcategoria);
 J   ALTER TABLE ONLY public.subcategorias DROP CONSTRAINT subcategorias_pkey;
       public         postgres    false    203            �
           2606    16401    sucursales sucursales_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.sucursales
    ADD CONSTRAINT sucursales_pkey PRIMARY KEY (id_sucursal);
 D   ALTER TABLE ONLY public.sucursales DROP CONSTRAINT sucursales_pkey;
       public         postgres    false    197            �
           2606    16476    usuarios usuarios_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuarios_pkey PRIMARY KEY (id_usuario);
 @   ALTER TABLE ONLY public.usuarios DROP CONSTRAINT usuarios_pkey;
       public         postgres    false    211            �
           2606    16460    vendedores vendedores_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.vendedores
    ADD CONSTRAINT vendedores_pkey PRIMARY KEY (id_vendedor);
 D   ALTER TABLE ONLY public.vendedores DROP CONSTRAINT vendedores_pkey;
       public         postgres    false    209            �
           2606    16426 -   subcategorias subcategorias_id_categoria_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.subcategorias
    ADD CONSTRAINT subcategorias_id_categoria_fkey FOREIGN KEY (id_categoria) REFERENCES public.categorias(id_categoria);
 W   ALTER TABLE ONLY public.subcategorias DROP CONSTRAINT subcategorias_id_categoria_fkey;
       public       postgres    false    203    2750    201            �
           2606    16490    usuarios usuarios_id_rol_fkey    FK CONSTRAINT        ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuarios_id_rol_fkey FOREIGN KEY (id_rol) REFERENCES public.roles(id_rol);
 G   ALTER TABLE ONLY public.usuarios DROP CONSTRAINT usuarios_id_rol_fkey;
       public       postgres    false    211    2762    213            �
           2606    16477 "   usuarios usuarios_id_sucursal_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuarios_id_sucursal_fkey FOREIGN KEY (id_sucursal) REFERENCES public.sucursales(id_sucursal);
 L   ALTER TABLE ONLY public.usuarios DROP CONSTRAINT usuarios_id_sucursal_fkey;
       public       postgres    false    197    2746    211            �
           2606    16461 &   vendedores vendedores_id_sucursal_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.vendedores
    ADD CONSTRAINT vendedores_id_sucursal_fkey FOREIGN KEY (id_sucursal) REFERENCES public.sucursales(id_sucursal);
 P   ALTER TABLE ONLY public.vendedores DROP CONSTRAINT vendedores_id_sucursal_fkey;
       public       postgres    false    209    197    2746            M      x������ � �      S      x������ � �      K      x������ � �      Q      x������ � �      Y      x������ � �      O      x������ � �      I      x������ � �      W      x������ � �      U      x������ � �     
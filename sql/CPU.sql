CREATE TABLE IF NOT EXISTS public.cpu
(
    id serial NOT NULL,
    nome character varying(100) COLLATE pg_catalog."default" NOT NULL,
    core integer NOT NULL,
    thread integer NOT NULL,
    clock_base numeric NOT NULL,
    clock_turbo numeric NOT NULL,
    "TDP" integer NOT NULL,
    socket character varying(10) COLLATE pg_catalog."default" NOT NULL,
    data_lancamento date NOT NULL,
    empresa character varying(5) COLLATE pg_catalog."default" NOT NULL,
    over boolean NOT NULL,
    litografia integer NOT NULL,
    preco numeric NOT NULL,
    CONSTRAINT cpu_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.cpu
    OWNER to postgres;
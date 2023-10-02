create table if not exists t_product
(
    id
    bigint
    auto_increment
    primary
    key,
    name
    varchar
(
    20
) not null comment '产品名称'
    )
    comment '产品表';

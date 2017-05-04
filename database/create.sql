drop table if exists t_message;

drop table if exists t_order;

drop table if exists t_order_track;

/*==============================================================*/
/* Table: t_message                                             */
/*==============================================================*/
create table t_message
(
   id                   int not null auto_increment comment '主键ID',
   business_type        char(1) comment '业务类型,1订单，2订单跟踪信息',
   data_type            varchar(8) comment '报文类型,json,xml',
   status               char(1) comment '状态,1未解析，2已解析，3解析异常，0放弃解析',
   content              text comment '报文内容',
   parses               int default 0 comment '解析次数',
   error_info           varchar(200) comment '异常描述',
   create_time          datetime default CURRENT_TIMESTAMP comment '录入时间',
   update_time          datetime comment '修改时间',
   primary key (id)
);

alter table t_message comment '报文消息表';

/*==============================================================*/
/* Table: t_order                                               */
/*==============================================================*/
create table t_order
(
   order_num            varchar(32) not null comment '订单号',
   sender_name          varchar(32) comment '发货人姓名',
   sender_phone         varchar(32) comment '发货人手机号码',
   sender_address       varchar(72) comment '发货人地址',
   receiver_name        varchar(32) comment '收货人姓名',
   receiver_phone       varchar(32) comment '收货人手机号码',
   receiver_address     varchar(72) comment '收货人地址',
   send_station_telegraph_code varchar(32) comment '发站电报码',
   send_station_name    varchar(32) comment '发站站名',
   receive_station_telegraph_code varchar(32) comment '收到电报码',
   receive_station_name varchar(32) comment '到站站名',
   goods_name           varchar(72) comment '物品名称',
   goods_size           varchar(32) comment '尺寸',
   goods_amount         int comment '数量',
   goods_weight         DECIMAL(10,2) comment '总重量',
   get_method           varchar(32) comment '取货方式',
   gate2station_fee     DECIMAL(10,2) comment '门到站费用',
   station2station_fee  DECIMAL(10,2) comment '站到站费用',
   station2gate_fee     DECIMAL(10,2) comment '站到门费用',
   total_fee            DECIMAL(10,2) comment '总费用',
   receive_province     varchar(32) comment '收货省',
   receive_city         varchar(32) comment '收货市',
   receive_area         varchar(32) comment '收货区县',
   send_province        varchar(32) comment '发货省',
   message_id           bigint comment '报文消息ID',
   create_time          datetime not null default CURRENT_TIMESTAMP comment '创建时间',
   goods_ticket_no      varchar(32) comment '货票号',
   primary key (order_num)
);

alter table t_order comment '订单信息表';

/*==============================================================*/
/* Table: t_order_track                                         */
/*==============================================================*/
create table t_order_track
(
   id                   varbinary(32) not null comment '主键ID',
   order_num            varbinary(32) comment '订单号',
   status_time          datetime comment '状态发生时间',
   status_operater      varbinary(32) comment '状态确认人',
   remark               varbinary(200) comment '备注',
   flow_name            varbinary(64) comment '流程名称',
   jjsj                 datetime comment '时间',
   jjcc                 varbinary(32) comment '车次',
   departure_date       datetime comment '开行日期',
   train_no             varbinary(32) comment '车号',
   train_num            varbinary(32) comment '车次',
   input_time           datetime comment '录入时间',
   begin_bureau_code    varbinary(32) comment '发站代码',
   end_bureau_code      varbinary(32) comment '到站代码',
   message_id           bigint comment '报文消息ID',
   create_time          datetime not null default CURRENT_TIMESTAMP comment '创建时间',
   primary key (id)
);

alter table t_order_track comment '订单跟踪信息表';

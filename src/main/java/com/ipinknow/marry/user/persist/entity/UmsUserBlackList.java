package com.ipinknow.marry.user.persist.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author system
 * @since 2021-06-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UmsUserBlackList extends Model<UmsUserBlackList> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 主动发起拉黑的用户ID
     */
    private Long userId;

    /**
     * 被拉黑的用户ID
     */
    private Long blackUserId;

    /**
     * 状态 0解除 1拉黑
     */
    private Integer state;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

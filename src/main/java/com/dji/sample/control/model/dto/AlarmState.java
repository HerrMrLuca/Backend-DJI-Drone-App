package com.dji.sample.control.model.dto;

import com.dji.sample.manage.model.enums.StateSwitchEnum;
import com.dji.sample.manage.model.receiver.BasicDeviceProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * @author sean
 * @version 1.3
 * @date 2022/11/25
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlarmState extends BasicDeviceProperty {

    private Integer action;

    @Override
    public boolean valid() {
        return Objects.nonNull(action) && StateSwitchEnum.find(action).isPresent();
    }
}

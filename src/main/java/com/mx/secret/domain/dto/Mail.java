package com.mx.secret.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;
import java.util.Map;


@ToString
@NoArgsConstructor
public class Mail implements Serializable {

    private static final long serialVersionUID = -8174581587647900376L;

    @Getter @Setter
    @NotEmpty(message = "*Please provide your from")
    private String from;

    @Getter @Setter
    @NotEmpty(message = "*Please provide your mailTo")
    private String mailTo;

    @Getter @Setter
    @NotEmpty(message = "*Please provide your subject")
    private String subject;

    @Getter @Setter
    private List<Object> attachments;

    @Getter @Setter
    private Map<String, Object> props;


}
package cn.edu.zjut.fts.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClosePositionRequest
{
    int positionId;
    int closeAmount;
    String delegateTime;
}


package cn.edu.zjut.fts.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetHistoricalDelegateRequest
{
    int userId;
    int futureId;
}
